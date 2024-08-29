import { AuthUserProvider } from "./context/authUser"
import AppRouter from "./router/AppRouter,"
function App() {

  return (
    
    <>
    <AuthUserProvider>
    <AppRouter/>
    </AuthUserProvider>
    </>
  )
}

export default App
