import { useEffect } from "react";
import { useState } from "react";
import { createContext } from "react";

export const AuthUserContext = createContext();
export const AuthUserProvider = ({ children }) => {
  const [isLogged, setIsLogged] = useState (false)
  useEffect(() => {
    const isLoggedLocal = localStorage.getItem('UsuarioActivo')
    if (isLoggedLocal) {
      setIsLogged(true)
    }
  }, [])
  return (
    <AuthUserContext.Provider value={{ isLogged, setIsLogged }}>
      {children}
    </AuthUserContext.Provider>
  )
};
