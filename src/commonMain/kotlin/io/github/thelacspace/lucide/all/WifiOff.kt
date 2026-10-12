package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.010000228881836,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,16.429000854492188)
                curveTo(10.444217681884766,14.523286819458008,13.555782318115234,14.523286819458008,15.5,16.429000854492188)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,12.859000205993652)
                curveTo(6.418027400970459,11.468908309936523,8.217808723449707,10.532465934753418,10.170000076293945,10.169000625610352)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,12.859000205993652)
                curveTo(18.39788246154785,12.26875114440918,17.72353172302246,11.757024765014648,16.993000030517578,11.336000442504883)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,8.819999694824219)
                curveTo(3.2365965843200684,7.714075088500977,4.64808988571167,6.82095193862915,6.177000045776367,6.177000045776367)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,8.819999694824219)
                curveTo(18.917171478271484,6.062764644622803,14.832679748535156,4.7007856369018555,10.711999893188477,5.055999755859375)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.WifiOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiOff: ImageVector
    @Composable get() = WifiOffDefinition.asImageVector()
