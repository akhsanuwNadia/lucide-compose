package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CreditCardX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.5f,19.0f)
                lineTo(4.0f,19.0f)
                curveTo(2.8954306f,19.0f,2.0f,18.10457f,2.0f,17.0f)
                lineTo(2.0f,7.0f)
                curveTo(2.0f,5.8954306f,2.8954306f,5.0f,4.0f,5.0f)
                lineTo(20.0f,5.0f)
                curveTo(21.10457f,5.0f,22.0f,5.8954306f,22.0f,7.0f)
                lineTo(22.0f,10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                lineTo(22.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                lineTo(8.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,14.5f)
                lineTo(21.5f,19.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5f,14.5f)
                lineTo(16.5f,19.5f)
            }
}

public val LucideIcons.All.CreditCardXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CreditCardX: ImageVector
    @Composable get() = CreditCardXDefinition.asImageVector()
