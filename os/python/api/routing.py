from django.conf.urls import url
from webApplicationAnalysis.consumers import WebApplicationAnalysisConsumer
from django.utils.translation import LANGUAGE_SESSION_KEY

websocket_urlpatterns = [
    url(r"^ws/play/(?P<room_code>\w+)/$", WebApplicationAnalysisConsumer.as_asgi()),
]
