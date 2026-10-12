package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CigaretteOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(3.0f,12.0f)
                curveTo(2.4477153f,12.0f,2.0f,12.447715f,2.0f,13.0f)
                lineTo(2.0f,15.0f)
                curveTo(2.0f,15.552285f,2.4477153f,16.0f,3.0f,16.0f)
                lineTo(16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                curveTo(18.0f,5.5f,16.0f,5.5f,16.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                curveTo(21.552284f,12.0f,22.0f,12.447715f,22.0f,13.0f)
                lineTo(22.0f,15.0f)
                curveTo(21.99999f,15.357257f,21.809393f,15.687372f,21.5f,15.866f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,8.0f)
                curveTo(22.0f,5.5f,20.0f,5.5f,20.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                lineTo(7.0f,16.0f)
            }
}

public val LucideIcons.All.CigaretteOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CigaretteOff: ImageVector
    @Composable get() = CigaretteOffDefinition.asImageVector()
