import React from 'react'
import { Route, Routes } from 'react-router-dom'
import Home from '../screens/Home'
import Español from '../screens/Español'
import Frances from '../screens/Frances'
import Ingles from '../screens/Ingles'
import { Navigate } from 'react-router-dom'

function SecoundRouter() {
  return (
    <Routes>

            <Route path="/home" element={<Home/>} />
            <Route path="/español" element={<Español/>} />
            <Route path="/frances" element={<Frances/>} />
            <Route path="/ingles" element={<Ingles/>} />
            <Route path="*" element={<Navigate to="/home" />} />
        </Routes>
  )
}

export default SecoundRouter