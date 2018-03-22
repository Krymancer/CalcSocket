# CalcSocket
A simple Server-Client to gets value, calculate and print the result.

# Info

Run frist the TCPServer after you can run the TCPClient and pass the arguments

String contains "numberoperationnumber", no spaces allowed, like this:	
	"xxxx+yyyy"

# Usage

You should run the commands like this, changing de operation and number at you like.
If you run the server in same machine that you run the client the servername is
localhost, if not, servername should the IP address of the machine runs TCPServer

	java TCPServer
	java TCPClient x+y servername
