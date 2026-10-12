package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dessert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.162f,3.167f)
                curveTo(5.428744f,4.0520506f,1.9983805f,8.18471f,2.0f,13.0f)
                curveTo(2.0049243f,14.101078f,2.8989108f,14.9910755f,4.0f,14.9910755f)
                curveTo(5.101089f,14.9910755f,5.9950757f,14.101078f,6.0f,13.0f)
                lineTo(6.0f,12.0f)
                curveTo(6.0049243f,10.898922f,6.898911f,10.0089245f,8.0f,10.0089245f)
                curveTo(9.1010895f,10.0089245f,9.995076f,10.898922f,10.0f,12.0f)
                lineTo(10.0f,16.0f)
                curveTo(10.004924f,17.101078f,10.8989105f,17.991076f,12.0f,17.991076f)
                curveTo(13.1010895f,17.991076f,13.995076f,17.101078f,14.0f,16.0f)
                lineTo(14.0f,12.0f)
                curveTo(14.004924f,10.898922f,14.8989105f,10.0089245f,16.0f,10.0089245f)
                curveTo(17.10109f,10.0089245f,17.995075f,10.898922f,18.0f,12.0f)
                lineTo(18.0f,13.0f)
                curveTo(18.006577f,14.10107f,18.901897f,14.989727f,20.002987f,14.988076f)
                curveTo(21.104076f,14.986424f,21.996727f,14.095086f,22.0f,12.994f)
                curveTo(21.99834f,8.18166f,18.569265f,4.0529895f,13.839f,3.1680002f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.804f,14.869f)
                curveTo(19.921738f,19.027067f,16.250637f,22.000957f,12.000001f,22.000957f)
                curveTo(7.7493653f,22.000957f,4.0782647f,19.027067f,3.196001f,14.869f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                curveTo(9.996795f,4.716662f,10.377291f,5.3802605f,10.997409f,5.7395196f)
                curveTo(11.617528f,6.098779f,12.382472f,6.098779f,13.002591f,5.7395196f)
                curveTo(13.622709f,5.3802605f,14.003205f,4.716662f,14.0f,4.0f)
                curveTo(14.003205f,3.283338f,13.622709f,2.6197395f,13.002591f,2.2604802f)
                curveTo(12.382472f,1.9012209f,11.617528f,1.9012209f,10.997409f,2.2604802f)
                curveTo(10.377291f,2.6197395f,9.996795f,3.283338f,10.0f,4.0f)
            }
}

public val LucideIcons.All.DessertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dessert: ImageVector
    @Composable get() = DessertDefinition.asImageVector()
