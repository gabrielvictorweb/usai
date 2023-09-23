import React from 'react';
import logo from './logo.svg';
import './App.css';

function App() {  
  const [output, setOutput] = React.useState("");

  const connect = (gameSocket: WebSocket) => {
    gameSocket.onopen = function open() {
        console.log('WebSockets connection created.');
        // on websocket open, send the START event.
        gameSocket.send(JSON.stringify({
            "event": "START",
            "message": ""
        }));
    };

    gameSocket.onclose = function (e) {
        console.log('Socket is closed. Reconnect will be attempted in 1 second.', e.reason);
        setTimeout(function () {
            connect(gameSocket);
        }, 1000);
    };
    // Sending the info about the room
    gameSocket.onmessage = function (e) {
        // On getting the message from the server
        // Do the appropriate steps on each event.
        let data = JSON.parse(e.data);
        setOutput(prev => prev + data.payload);
    };

    if (gameSocket.readyState === WebSocket.OPEN) {
        // gameSocket.onopen();
    }
  }
  
  React.useEffect(() => {
    const connectionString = 'ws://localhost:8000/ws/play/11/';
    const gameSocket = new WebSocket(connectionString);
    
    connect(gameSocket);
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <span className="text-1xl font-bold underline">{output}</span>
      </header>
    </div>
  );
}

export default App;
