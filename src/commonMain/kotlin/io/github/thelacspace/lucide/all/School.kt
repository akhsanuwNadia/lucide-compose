package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("School") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,21.0f)
                lineTo(14.0f,18.0f)
                curveTo(13.995076f,16.898922f,13.1010895f,16.008924f,12.0f,16.008924f)
                curveTo(10.8989105f,16.008924f,10.004924f,16.898922f,10.0f,18.0f)
                lineTo(10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,4.933f)
                lineTo(18.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,6.0f)
                lineTo(11.106f,2.21f)
                curveTo(11.668821f,1.9287572f,12.331179f,1.9287572f,12.894f,2.21f)
                lineTo(20.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,11.0f)
                lineTo(2.48f,13.147f)
                curveTo(2.181971f,13.328435f,2.000058f,13.652088f,2.0f,14.001f)
                lineTo(2.0f,19.0f)
                curveTo(2.0f,20.10457f,2.8954306f,21.0f,4.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(21.10457f,21.0f,22.0f,20.10457f,22.0f,19.0f)
                lineTo(22.0f,14.0f)
                curveTo(21.999594f,13.651444f,21.817724f,13.328249f,21.52f,13.147f)
                lineTo(18.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,4.933f)
                lineTo(6.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,9.0f)
                curveTo(9.996795f,9.716661f,10.377291f,10.38026f,10.997409f,10.73952f)
                curveTo(11.617528f,11.098779f,12.382472f,11.098779f,13.002591f,10.73952f)
                curveTo(13.622709f,10.38026f,14.003205f,9.716661f,14.0f,9.0f)
                curveTo(14.003205f,8.283339f,13.622709f,7.6197395f,13.002591f,7.2604804f)
                curveTo(12.382472f,6.901221f,11.617528f,6.901221f,10.997409f,7.2604804f)
                curveTo(10.377291f,7.6197395f,9.996795f,8.283339f,10.0f,9.0f)
            }
}

public val LucideIcons.All.SchoolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.School: ImageVector
    @Composable get() = SchoolDefinition.asImageVector()
