import React from 'react';
import { ContainerStyled } from "./styles"

interface ContainerProps {
    children: React.ReactNode
}

export const Container: React.FC<ContainerProps> = ({ children }) => {
    return(
        <ContainerStyled>
            <div className="content">
                {children}
            </div>
        </ContainerStyled>
    )
} 