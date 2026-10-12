package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DecimalsArrowRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,18.0f)
                lineTo(20.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,21.0f)
                lineTo(20.0f,18.0f)
                lineTo(17.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,11.0f)
                lineTo(3.01f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f,3.0f)
                lineTo(17.5f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(20.0f,11.0f)
                lineTo(17.5f,11.0f)
                lineTo(17.5f,11.0f)
                lineTo(15.0f,11.0f)
                lineTo(15.0f,3.0f)
                lineTo(17.5f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,3.0f)
                lineTo(8.5f,3.0f)
                lineTo(11.0f,3.0f)
                lineTo(11.0f,11.0f)
                lineTo(8.5f,11.0f)
                lineTo(8.5f,11.0f)
                lineTo(6.0f,11.0f)
                lineTo(6.0f,3.0f)
                lineTo(8.5f,3.0f)
                close()
            }
}

public val LucideIcons.All.DecimalsArrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DecimalsArrowRight: ImageVector
    @Composable get() = DecimalsArrowRightDefinition.asImageVector()
