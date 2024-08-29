import { BrowserRouter, Route, Routes, } from 'react-router-dom'
import Navbar from '../components/Navbar'
import Login from '../screens/Login'
import Register from '../screens/Register'
import SecoundRouter from './SecoundRouter'
import { Navigate } from 'react-router-dom'
import { AuthUserContext } from '../context/authUser'
import { useContext } from 'react'

function AppRouter() {
  const {isLogged}=useContext(AuthUserContext)
  return (
    <BrowserRouter>
        <Navbar/>
        <Routes>
          {
            isLogged ? (
              <Route path="/*" element={<SecoundRouter/>} />
            ) : (
 
              <>
              <Route path="/login" element={<Login/>} />
              <Route path="/register" element={<Register/>} />
              </>
            )
          }
          <Route path='/*' element={<Navigate to='login'/>}/>
            
        </Routes>
      </BrowserRouter>
  )
}

export default AppRouter