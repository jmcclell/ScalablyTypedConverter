package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeDashMappingsLib {
  type AgePerson = stdLib.Exclude[Person, NamePerson]
  type AgePerson2 = stdLib.Extract[Person, AgePerson]
  type IPersonRecord = PersonRecord
  type IProxiedPerson = Proxify[Person]
  type NamePerson = stdLib.Pick[Person, typeDashMappingsLib.typeDashMappingsLibStrings.name]
  type NewedPerson = stdLib.InstanceType[org.scalablytyped.runtime.Instantiable0[Person]]
  type NonNullablePerson = stdLib.NonNullable[Person]
  type PartialPerson = stdLib.Partial[Person]
  type PersonRecord = stdLib.Record[
    typeDashMappingsLib.typeDashMappingsLibStrings.name | typeDashMappingsLib.typeDashMappingsLibStrings.age, 
    java.lang.String
  ]
  type ProxiedPerson = Proxify[Person]
  type Proxify[T] = typeDashMappingsLib.typeDashMappingsLibStrings.Proxify with T
  type ReadonlyPerson = stdLib.Readonly[Person]
  type RequiredPerson = stdLib.Required[Person]
  type ReturnedPerson = stdLib.ReturnType[js.Function0[Person]]
  type T = stdLib.Pick[
    Anon_Name | Anon_Age, 
    typeDashMappingsLib.typeDashMappingsLibStrings.name with typeDashMappingsLib.typeDashMappingsLibStrings.age
  ]
  type TypographyStyle = (stdLib.Required[
    stdLib.Pick[
      CSSProperties, 
      typeDashMappingsLib.typeDashMappingsLibStrings.fontFamily | typeDashMappingsLib.typeDashMappingsLibStrings.fontSize | typeDashMappingsLib.typeDashMappingsLibStrings.fontWeight | typeDashMappingsLib.typeDashMappingsLibStrings.color
    ]
  ]) with (stdLib.Partial[
    stdLib.Pick[
      CSSProperties, 
      typeDashMappingsLib.typeDashMappingsLibStrings.letterSpacing | typeDashMappingsLib.typeDashMappingsLibStrings.lineHeight | typeDashMappingsLib.typeDashMappingsLibStrings.textTransform
    ]
  ])
  type TypographyStyleOptions = /* InlineNestedIdentityAlias: stdLib.Partial*/ TypographyStyle
  type U = stdLib.Pick[
    Anon_AgeName, 
    typeDashMappingsLib.typeDashMappingsLibStrings.name | typeDashMappingsLib.typeDashMappingsLibStrings.age
  ]
  type V = stdLib.Pick[Anon_AgeName, typeDashMappingsLib.typeDashMappingsLibStrings.age]
}