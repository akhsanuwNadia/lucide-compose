package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GeorgianLari") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.5f,21.0f)
                curveTo(7.5533104f,20.999195f,4.2825146f,17.939838f,4.01835f,14.001999f)
                curveTo(3.754186f,10.064159f,6.587049f,6.595348f,10.498268f,6.0674057f)
                curveTo(14.409488f,5.539463f,18.060663f,8.13305f,18.85f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,12.0f)
                lineTo(13.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,21.0f)
                lineTo(20.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(9.0f,3.0f)
            }
}

public val LucideIcons.All.GeorgianLariDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GeorgianLari: ImageVector
    @Composable get() = GeorgianLariDefinition.asImageVector()
