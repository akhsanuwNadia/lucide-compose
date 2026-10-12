package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileImage") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.639365f,1.9989636f,15.252715f,2.2530863f,15.704f,2.7059999f)
                lineTo(19.292f,6.2939997f)
                curveTo(19.74614f,6.745444f,20.00104f,7.3596535f,20.0f,8.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                curveTo(7.996795f,12.716661f,8.377291f,13.38026f,8.997409f,13.73952f)
                curveTo(9.617528f,14.098779f,10.382472f,14.098779f,11.002591f,13.73952f)
                curveTo(11.622709f,13.38026f,12.003205f,12.716661f,12.0f,12.0f)
                curveTo(12.003205f,11.283339f,11.622709f,10.61974f,11.002591f,10.26048f)
                curveTo(10.382472f,9.901221f,9.617528f,9.901221f,8.997409f,10.26048f)
                curveTo(8.377291f,10.61974f,7.996795f,11.283339f,8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,17.0f)
                lineTo(18.704f,15.704f)
                curveTo(17.762867f,14.763007f,16.237135f,14.763007f,15.2960005f,15.704f)
                lineTo(9.0f,22.0f)
            }
}

public val LucideIcons.All.FileImageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileImage: ImageVector
    @Composable get() = FileImageDefinition.asImageVector()
