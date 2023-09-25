import React from 'react'
import {
  createBrowserRouter,
  RouterProvider
} from 'react-router-dom'
import { Home } from '../pages'

const router = createBrowserRouter([
  {
    path: '/',
    element: <Home />
  }
])

const Routes = (): React.ReactElement => <RouterProvider router={router} />

export default Routes
