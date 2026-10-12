package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PawPrint") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,4.0f)
                curveTo(8.996795f,4.716662f,9.377291f,5.3802605f,9.997409f,5.7395196f)
                curveTo(10.617528f,6.098779f,11.382472f,6.098779f,12.002591f,5.7395196f)
                curveTo(12.622709f,5.3802605f,13.003205f,4.716662f,13.0f,4.0f)
                curveTo(13.003205f,3.283338f,12.622709f,2.6197395f,12.002591f,2.2604802f)
                curveTo(11.382472f,1.9012209f,10.617528f,1.9012209f,9.997409f,2.2604802f)
                curveTo(9.377291f,2.6197395f,8.996795f,3.283338f,9.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,8.0f)
                curveTo(15.996795f,8.716661f,16.37729f,9.38026f,16.99741f,9.73952f)
                curveTo(17.617527f,10.098779f,18.382473f,10.098779f,19.00259f,9.73952f)
                curveTo(19.62271f,9.38026f,20.003204f,8.716661f,20.0f,8.0f)
                curveTo(20.003204f,7.283338f,19.62271f,6.6197395f,19.00259f,6.2604804f)
                curveTo(18.382473f,5.901221f,17.617527f,5.901221f,16.99741f,6.2604804f)
                curveTo(16.37729f,6.6197395f,15.996795f,7.283338f,16.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,16.0f)
                curveTo(17.996796f,16.716661f,18.37729f,17.38026f,18.99741f,17.73952f)
                curveTo(19.617527f,18.09878f,20.382473f,18.09878f,21.00259f,17.73952f)
                curveTo(21.62271f,17.38026f,22.003204f,16.716661f,22.0f,16.0f)
                curveTo(22.003204f,15.283339f,21.62271f,14.61974f,21.00259f,14.26048f)
                curveTo(20.382473f,13.901221f,19.617527f,13.901221f,18.99741f,14.26048f)
                curveTo(18.37729f,14.61974f,17.996796f,15.283339f,18.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.0f)
                curveTo(11.761424f,10.0f,14.0f,12.238576f,14.0f,15.0f)
                lineTo(14.0f,18.5f)
                curveTo(13.999439f,20.228453f,12.737217f,21.69768f,11.028589f,21.95872f)
                curveTo(9.319962f,22.21976f,7.676627f,21.194439f,7.16f,19.545f)
                quadTo(6.52f,17.48f,4.46f,16.84f)
                curveTo(2.811457f,16.323662f,1.7862087f,14.681761f,2.045887f,12.973878f)
                curveTo(2.305565f,11.265994f,3.7724903f,10.003019f,5.5f,10.0f)
                close()
            }
}

public val LucideIcons.All.PawPrintDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PawPrint: ImageVector
    @Composable get() = PawPrintDefinition.asImageVector()
