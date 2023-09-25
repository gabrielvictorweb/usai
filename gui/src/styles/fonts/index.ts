import { createGlobalStyle } from 'styled-components'
import SchrottingerJustusSchrotte from '../../assets/fonts/Schrottinger_Justus_Schrotte.ttf'

export default createGlobalStyle`
    @font-face {
        font-family: 'SchrottingerJustusSchrotte';
        src: url(${SchrottingerJustusSchrotte}) format('truetype');
    }
`
