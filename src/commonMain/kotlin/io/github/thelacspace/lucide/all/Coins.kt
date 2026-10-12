package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Coins") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.744000434875488,17.736000061035156)
                curveTo(12.91500473022461,20.477088928222656,10.264459609985352,22.250267028808594,7.41446590423584,21.97037124633789)
                curveTo(4.564472675323486,21.690473556518555,2.309527635574341,19.435527801513672,2.029630422592163,16.585535049438477)
                curveTo(1.749733328819275,13.735542297363281,3.522911310195923,11.084996223449707,6.264000415802002,10.256000518798828)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,6.0)
                lineTo(16.0,6.0)
                lineTo(16.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.133999824523926,14.767999649047852)
                lineTo(7.0,14.267999649047852)
                lineTo(9.0,17.73200035095215)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                curveTo(9.990385055541992,10.149985313415527,11.131871223449707,12.14078140258789,12.992227554321289,13.218559265136719)
                curveTo(14.852583885192871,14.296337127685547,17.147417068481445,14.296337127685547,19.00777244567871,13.218559265136719)
                curveTo(20.86812973022461,12.14078140258789,22.009614944458008,10.149985313415527,22.0,8.0)
                curveTo(22.009614944458008,5.8500142097473145,20.86812973022461,3.8592188358306885,19.00777244567871,2.7814407348632812)
                curveTo(17.147417068481445,1.703662633895874,14.852583885192871,1.703662633895874,12.992227554321289,2.7814407348632812)
                curveTo(11.131871223449707,3.8592188358306885,9.990385055541992,5.8500142097473145,10.0,8.0)
            }
}

public val LucideIcons.All.CoinsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Coins: ImageVector
    @Composable get() = CoinsDefinition.asImageVector()
