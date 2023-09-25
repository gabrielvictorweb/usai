import React from 'react';
import { Logo, HeaderContainer } from './styles';

export const Header: React.FC = () => {
    return (
        <HeaderContainer>
            <nav className="content">
                <Logo>UISA</Logo>
            </nav>
        </HeaderContainer>
    );
}