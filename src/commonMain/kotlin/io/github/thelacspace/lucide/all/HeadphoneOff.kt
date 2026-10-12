package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeadphoneOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,14.0)
                lineTo(19.656999588012695,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.128000259399414,3.4700000286102295)
                curveTo(11.87440299987793,2.545243501663208,14.89807415008545,2.999507427215576,17.251506805419922,4.6904425621032715)
                curveTo(19.604938507080078,6.381377220153809,21.00017547607422,9.102086067199707,21.0,12.0)
                lineTo(21.0,15.343000411987305)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.413999557495117,20.413999557495117)
                curveTo(20.03901481628418,20.789098739624023,19.5303897857666,20.99988555908203,19.0,21.0)
                lineTo(18.0,21.0)
                curveTo(16.895429611206055,21.0,16.0,20.104570388793945,16.0,19.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,14.0)
                lineTo(6.0,14.0)
                curveTo(7.104569435119629,14.0,8.0,14.895430564880371,8.0,16.0)
                lineTo(8.0,19.0)
                curveTo(8.0,20.104570388793945,7.104569435119629,21.0,6.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,12.0)
                curveTo(2.999979257583618,9.613043785095215,3.9481770992279053,7.323843479156494,5.63599967956543,5.636000156402588)
            }
}

public val LucideIcons.All.HeadphoneOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeadphoneOff: ImageVector
    @Composable get() = HeadphoneOffDefinition.asImageVector()
