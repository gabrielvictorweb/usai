import React from 'react'
import { ContainerStyled } from './styles'
import { type ComponentProps } from 'interfaces/generics'

export const Container: React.FC<ComponentProps> = ({ children }) => {
  return (
    <ContainerStyled>
      <div className="content">
        {children}
      </div>
    </ContainerStyled>
  )
}
