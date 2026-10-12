package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageCircleDashedCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.100000381469727,2.181999921798706)
                curveTo(11.355024337768555,1.939121127128601,12.644976615905762,1.939121127128601,13.90000057220459,2.181999921798706)
            }
            lucidePath(strokeWidth) {
                moveTo(13.899999618530273,21.81800079345703)
                curveTo(12.644975662231445,22.06087875366211,11.355023384094238,22.06087875366211,10.09999942779541,21.81800079345703)
            }
            lucidePath(strokeWidth) {
                moveTo(17.608999252319336,3.7200000286102295)
                curveTo(18.670469284057617,4.439223289489746,19.58371925354004,5.355868816375732,20.298999786376953,6.420000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(2.181999921798706,13.899999618530273)
                curveTo(1.939121127128601,12.644975662231445,1.939121127128601,11.355023384094238,2.181999921798706,10.09999942779541)
            }
            lucidePath(strokeWidth) {
                moveTo(20.280000686645508,17.610000610351562)
                curveTo(19.56077766418457,18.671470642089844,18.64413070678711,19.584720611572266,17.579999923706055,20.30000114440918)
            }
            lucidePath(strokeWidth) {
                moveTo(21.81800079345703,10.100000381469727)
                curveTo(22.06087875366211,11.355024337768555,22.06087875366211,12.644976615905762,21.81800079345703,13.90000057220459)
            }
            lucidePath(strokeWidth) {
                moveTo(3.7209999561309814,6.390999794006348)
                curveTo(4.440223217010498,5.329529762268066,5.356868743896484,4.416279315948486,6.421000003814697,3.7009997367858887)
            }
            lucidePath(strokeWidth) {
                moveTo(6.163000106811523,21.117000579833984)
                lineTo(3.257000207901001,21.96700096130371)
                curveTo(2.9220542907714844,22.055971145629883,2.56492280960083,21.96517562866211,2.313138246536255,21.727039337158203)
                curveTo(2.0613534450531006,21.488903045654297,1.9508166313171387,21.137380599975586,2.021000385284424,20.79800033569336)
                lineTo(2.9860002994537354,17.81800079345703)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,9.0)
                lineTo(10.5,14.5)
                lineTo(8.0,12.0)
            }
}

public val LucideIcons.All.MessageCircleDashedCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageCircleDashedCheck: ImageVector
    @Composable get() = MessageCircleDashedCheckDefinition.asImageVector()
