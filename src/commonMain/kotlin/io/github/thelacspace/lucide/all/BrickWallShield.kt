package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrickWallShield") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,9.0f)
                lineTo(12.0f,10.258f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                lineTo(16.0f,8.46f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,9.118f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(10.75f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.5f)
                curveTo(22.0f,19.999f,20.25f,21.249f,18.17f,21.973999f)
                curveTo(18.06108f,22.010908f,17.94277f,22.009142f,17.835001f,21.969f)
                curveTo(15.750001f,21.249f,14.000001f,19.999f,14.000001f,17.499f)
                lineTo(14.000001f,14.0f)
                curveTo(14.000553f,13.724248f,14.224249f,13.500999f,14.500001f,13.501f)
                curveTo(15.500001f,13.501f,16.75f,12.901f,17.62f,12.141001f)
                curveTo(17.840803f,11.959813f,18.158722f,11.959394f,18.380001f,12.14f)
                curveTo(19.255001f,12.905001f,20.5f,13.5f,21.5f,13.5f)
                curveTo(21.776142f,13.5f,22.0f,13.723858f,22.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,15.0f)
                lineTo(10.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(15.142f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,15.0f)
                lineTo(8.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,3.0f)
                lineTo(8.0f,9.0f)
            }
}

public val LucideIcons.All.BrickWallShieldDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrickWallShield: ImageVector
    @Composable get() = BrickWallShieldDefinition.asImageVector()
