import React from 'react'
import Routes from 'routes'
import { Header } from 'components'
import Fonts from 'styles/fonts'

function App (): React.ReactElement {
  // const [output, setOutput] = React.useState('')

  // const connect = (gameSocket: WebSocket) => {
  //   gameSocket.onopen = function open () {
  //     console.log('WebSockets connection created.')
  //     // on websocket open, send the START event.
  //     gameSocket.send(JSON.stringify({
  //       event: 'START',
  //       message: ''
  //     }))
  //   }

  //   gameSocket.onclose = function (e) {
  //     console.log('Socket is closed. Reconnect will be attempted in 1 second.', e.reason)
  //     setTimeout(function () {
  //       connect(gameSocket)
  //     }, 1000)
  //   }
  //   // Sending the info about the room
  //   gameSocket.onmessage = function (e) {
  //     // On getting the message from the server
  //     // Do the appropriate steps on each event.
  //     const data = JSON.parse(e.data)
  //     setOutput(prev => prev + data.payload)
  //   }

  //   if (gameSocket.readyState === WebSocket.OPEN) {
  //     // gameSocket.onopen();
  //   }
  // }

  // React.useEffect(() => {
  //   const connectionString = 'ws://10.5.0.6:8000/ws/play/11/'
  //   const gameSocket = new WebSocket(connectionString)

  //   connect(gameSocket)
  // }, [])

  return (
    <div className="App">
      <Header />
      <Routes />
      <Fonts />
    </div>
  )
}

export default App
