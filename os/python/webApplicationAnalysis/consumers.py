import json
import subprocess
from channels.generic.websocket import AsyncJsonWebsocketConsumer
import asyncio


class WebApplicationAnalysisConsumer(AsyncJsonWebsocketConsumer):
    async def connect(self):
        self.room_name = self.scope["url_route"]["kwargs"]["room_code"]
        self.room_group_name = "room_%s" % self.room_name

        # Join room group
        await self.channel_layer.group_add(self.room_group_name, self.channel_name)
        await self.accept()

    async def disconnect(self, close_code):
        print("Disconnected")
        # Leave room group
        await self.channel_layer.group_discard(self.room_group_name, self.channel_name)

    async def receive(self, text_data):
        """
        Receive message from WebSocket.
        Get the event and send the appropriate event
        """
        response = json.loads(text_data)
        event = response.get("event", None)
        message = response.get("message", None)

        if event == "START":
            # Send message to room group
            await self.channel_layer.group_send(
                self.room_group_name,
                {"type": "send_message", "message": message, "event": "START"},
            )

    async def send_message(self, res):
        """Receive message from room group"""
        with subprocess.Popen(
            ["ip", "a"], stdout=subprocess.PIPE, bufsize=1, universal_newlines=True
        ) as process:
            for line in process.stdout:
                line = line.rstrip()
                await self.send(text_data=json.dumps({"payload": line}))
