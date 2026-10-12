package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SoapDispenserDroplet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5f,2.0f)
                lineTo(10.5f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(7.0f,2.0f)
                curveTo(5.8954306f,2.0f,5.0f,2.8954306f,5.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.29f,14.76f)
                curveTo(18.123121f,13.801964f,17.315788f,12.476387f,17.0f,11.0f)
                curveTo(16.689495f,12.478485f,15.881167f,13.805696f,14.71f,14.76f)
                curveTo(13.56f,15.68f,13.0f,16.8f,13.0f,17.95f)
                curveTo(13.0f,20.17f,14.8f,22.0f,17.0f,22.0f)
                curveTo(19.2f,22.0f,21.0f,20.17f,21.0f,17.95f)
                curveTo(21.0f,16.79f,20.43f,15.690001f,19.29f,14.76f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.607f,21.0f)
                lineTo(6.0f,21.0f)
                curveTo(4.8954306f,21.0f,4.0f,20.10457f,4.0f,19.0f)
                lineTo(4.0f,12.0f)
                curveTo(4.0f,10.895431f,4.8954306f,10.0f,6.0f,10.0f)
                lineTo(13.0f,10.0f)
                lineTo(13.0f,7.0f)
                curveTo(13.0f,6.4477153f,12.552285f,6.0f,12.0f,6.0f)
                lineTo(9.0f,6.0f)
                curveTo(8.447715f,6.0f,8.0f,6.4477153f,8.0f,7.0f)
                lineTo(8.0f,10.0f)
            }
}

public val LucideIcons.All.SoapDispenserDropletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SoapDispenserDroplet: ImageVector
    @Composable get() = SoapDispenserDropletDefinition.asImageVector()
