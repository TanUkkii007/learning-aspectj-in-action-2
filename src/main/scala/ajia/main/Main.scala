package ajia.main

import ajia.messaging.MessageCommunicator

object Main extends App {

  new MessageCommunicator().deliver("Wanna learn AspectJ?")
  new MessageCommunicator().deliver("Harry, having fun?")
}
