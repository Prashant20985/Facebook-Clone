/** @type {import('next').NextConfig} */
const nextConfig = {
  reactStrictMode: true,
  images:{
    domains:[
    "www.facebook.com",
    "static.xx.fbcdn.net",
    "platform-lookaside.fbsbx.com",
    "i.pinimg.com",
  ],
  }
}

module.exports = nextConfig
