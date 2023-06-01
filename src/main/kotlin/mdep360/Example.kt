package mdep360

import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.kms.KmsClient

class Example {
  fun invokeBinder() : Unit {
     KmsClient.builder().region(Region.US_EAST_1).build()
  }
}
