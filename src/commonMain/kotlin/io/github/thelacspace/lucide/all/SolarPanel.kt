package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SolarPanel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,2.0f)
                lineTo(13.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.28f,14.0f)
                lineTo(9.719999f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,22.0f)
                lineTo(19.442f,18.0f)
                lineTo(4.558f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,10.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.245f,15.04f)
                curveTo(6.595936f,14.398614f,7.268883f,13.99983f,8.0f,14.0f)
                lineTo(20.0f,14.0f)
                curveTo(20.358456f,13.999684f,20.689663f,14.191253f,20.86813f,14.502124f)
                curveTo(21.046597f,14.812995f,21.045021f,15.195609f,20.864f,15.505f)
                lineTo(17.754f,20.962f)
                curveTo(17.40271f,21.602299f,16.730333f,22.000204f,16.0f,22.0f)
                lineTo(4.0f,22.0f)
                curveTo(3.6414106f,22.000168f,3.3101816f,21.80832f,3.1318934f,21.497192f)
                curveTo(2.953605f,21.186068f,2.9555535f,20.803295f,3.137f,20.494f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,2.0f)
                curveTo(7.0f,4.209139f,5.209139f,6.0f,3.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.66f,7.66f)
                lineTo(10.07f,9.07f)
            }
}

public val LucideIcons.All.SolarPanelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SolarPanel: ImageVector
    @Composable get() = SolarPanelDefinition.asImageVector()
