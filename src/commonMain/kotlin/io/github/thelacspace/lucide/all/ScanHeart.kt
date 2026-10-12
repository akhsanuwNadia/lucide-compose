package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScanHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,17.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(17.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(7.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.828000068664551,13.069999694824219)
                curveTo(6.713962554931641,11.904677391052246,6.7201104164123535,10.067243576049805,7.841920852661133,8.909401893615723)
                curveTo(8.963730812072754,7.751560688018799,10.800052642822266,7.687346935272217,12.0,8.763999938964844)
                curveTo(13.199946403503418,7.687341213226318,15.036273002624512,7.751552104949951,16.158084869384766,8.909396171569824)
                curveTo(17.279897689819336,10.067239761352539,17.286043167114258,11.904678344726562,16.172000885009766,13.069999694824219)
                lineTo(12.725000381469727,16.689998626708984)
                curveTo(12.536235809326172,16.888410568237305,12.274359703063965,17.00072479248047,12.000499725341797,17.00072479248047)
                curveTo(11.726640701293945,17.00072479248047,11.464764595031738,16.888410568237305,11.276000022888184,16.689998626708984)
                close()
            }
}

public val LucideIcons.All.ScanHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScanHeart: ImageVector
    @Composable get() = ScanHeartDefinition.asImageVector()
