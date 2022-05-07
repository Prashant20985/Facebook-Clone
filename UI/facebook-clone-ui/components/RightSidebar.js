import React from 'react'
import {RiVideoAddFill} from 'react-icons/ri'
import {BiSearch} from 'react-icons/bi'
import {CgMoreAlt} from 'react-icons/cg'
import Contacts from './Contacts'

const RightSidebar = () => {
  return (
    <div className="hidden md:inline-flex flex-col pt-4 
    max-w-xl md:min-w-[200px] lg:min-w-[250px]">
        <div className="flex items-center text-gray-500">
            <p className="flex text-lg font-semibold flex-grow">
                Contacts</p>
            <div className="flex space-x-1 px-2">
                <div className="rounded-full p-2 hover:bg-gray-200 cursor-pointer">
                    <RiVideoAddFill/>
                </div>
                <div className="rounded-full p-2 hover:bg-gray-200 cursor-pointer">
                    <BiSearch/>
                </div>
                <div className="rounded-full p-2 hover:bg-gray-200 cursor-pointer">
                    <CgMoreAlt/>
                </div>
            </div>
        </div>
        <Contacts src="https://i.pinimg.com/originals/15/ae/c9/15aec99dd910ef9b6d9d14836a2ac6a1.jpg" name ="Prashant Sharma" status = "Online" />
        <Contacts src="https://i.pinimg.com/originals/15/ae/c9/15aec99dd910ef9b6d9d14836a2ac6a1.jpg" name ="Vatsal Patel" status = "Online"/>
        <Contacts src="https://i.pinimg.com/originals/15/ae/c9/15aec99dd910ef9b6d9d14836a2ac6a1.jpg" name ="Harsh Patel"status = "Offline"/>
    </div>
  )
}

export default RightSidebar