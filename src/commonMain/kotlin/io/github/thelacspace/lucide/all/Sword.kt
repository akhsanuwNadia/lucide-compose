package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sword") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,19.0f)
                lineTo(5.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,21.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,16.0f)
                lineTo(4.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f,17.5f)
                lineTo(20.414f,6.586f)
                curveTo(20.789099f,6.2110147f,20.999887f,5.7023897f,21.0f,5.172f)
                lineTo(21.0f,3.0f)
                lineTo(18.828f,3.0f)
                curveTo(18.29761f,3.0001135f,17.788984f,3.2109013f,17.414f,3.586f)
                lineTo(6.5f,14.5f)
            }
}

public val LucideIcons.All.SwordDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sword: ImageVector
    @Composable get() = SwordDefinition.asImageVector()
