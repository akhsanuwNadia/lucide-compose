package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldHouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,22.0f)
                curveTo(14.447715f,22.0f,14.0f,21.552284f,14.0f,21.0f)
                lineTo(14.0f,17.0f)
                curveTo(13.999949f,16.665722f,14.16693f,16.353523f,14.445f,16.168f)
                lineTo(17.445f,14.167999f)
                curveTo(17.781036f,13.943799f,18.218964f,13.943799f,18.555f,14.167999f)
                lineTo(21.555f,16.168f)
                curveTo(21.83307f,16.353523f,22.00005f,16.665722f,22.0f,17.0f)
                lineTo(22.0f,21.0f)
                curveTo(22.0f,21.552284f,21.552284f,22.0f,21.0f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(18.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,10.418f)
                lineTo(20.0f,6.0f)
                curveTo(20.0f,5.4477153f,19.552284f,5.0f,19.0f,5.0f)
                curveTo(17.0f,5.0f,14.51f,3.81f,12.76f,2.28f)
                curveTo(12.322327f,1.906067f,11.677673f,1.906067f,11.24f,2.28f)
                curveTo(9.5f,3.8f,7.0f,5.0f,5.0f,5.0f)
                curveTo(4.4477153f,5.0f,4.0f,5.4477153f,4.0f,6.0f)
                lineTo(4.0f,13.0f)
                curveTo(4.0f,17.602001f,6.67f,20.1f,10.037001f,21.603f)
            }
}

public val LucideIcons.All.ShieldHouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldHouse: ImageVector
    @Composable get() = ShieldHouseDefinition.asImageVector()
