package ajia.security

import org.aspectj.lang.annotation.{Pointcut, Before, Aspect}

@Aspect
class SecurityAspect {
  private val authenticator = new Authenticator()

  @Pointcut("execution(* ajia.messaging.MessageCommunicator.deliver(..))")
  def secureAccess() = {
    println("secureAccess")
  }

  @Before("secureAccess()")
  def secure() = {
    println("Checking and authenticating user")
    authenticator.authenticate()
  }

}
