package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Droplets") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,16.3f)
                curveTo(9.2f,16.3f,11.0f,14.469999f,11.0f,12.249999f)
                curveTo(11.0f,11.089999f,10.43f,9.989999f,9.29f,9.059999f)
                curveTo(8.15f,8.13f,7.29f,6.75f,7.0f,5.3f)
                curveTo(6.71f,6.75f,5.86f,8.14f,4.71f,9.06f)
                curveTo(3.56f,9.9800005f,3.0f,11.1f,3.0f,12.25f)
                curveTo(3.0f,14.47f,4.8f,16.3f,7.0f,16.3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.56f,6.6f)
                curveTo(13.247759f,5.501125f,13.7353f,4.289044f,14.0f,3.02f)
                curveTo(14.5f,5.52f,16.0f,7.92f,18.0f,9.52f)
                curveTo(20.0f,11.120001f,21.0f,13.02f,21.0f,15.02f)
                curveTo(21.011686f,17.846949f,19.31706f,20.401794f,16.70813f,21.49049f)
                curveTo(14.099202f,22.579187f,11.091215f,21.986725f,9.09f,19.99f)
            }
}

public val LucideIcons.All.DropletsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Droplets: ImageVector
    @Composable get() = DropletsDefinition.asImageVector()
