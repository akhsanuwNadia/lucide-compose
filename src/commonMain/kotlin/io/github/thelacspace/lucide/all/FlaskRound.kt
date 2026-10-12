package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlaskRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(10.0,8.291999816894531)
                curveTo(6.669246196746826,9.285038948059082,4.57155704498291,12.571565628051758,5.073333263397217,16.01078987121582)
                curveTo(5.575109481811523,19.450016021728516,8.52436351776123,22.00020408630371,12.0,22.00020408630371)
                curveTo(15.47563648223877,22.00020408630371,18.424890518188477,19.450016021728516,18.926666259765625,16.01078987121582)
                curveTo(19.428443908691406,12.571565628051758,17.330753326416016,9.285038948059082,14.0,8.291999816894531)
                lineTo(14.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,15.0)
                lineTo(19.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,2.0)
                lineTo(15.5,2.0)
            }
}

public val LucideIcons.All.FlaskRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlaskRound: ImageVector
    @Composable get() = FlaskRoundDefinition.asImageVector()
