package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CreditCardMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,13.0f)
                lineTo(22.0f,7.0f)
                curveTo(22.0f,5.8954306f,21.10457f,5.0f,20.0f,5.0f)
                lineTo(4.0f,5.0f)
                curveTo(2.8954306f,5.0f,2.0f,5.8954306f,2.0f,7.0f)
                lineTo(2.0f,17.0f)
                curveTo(2.0f,18.10457f,2.8954306f,19.0f,4.0f,19.0f)
                lineTo(12.536f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,10.0f)
                lineTo(2.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                lineTo(8.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,17.0f)
                lineTo(22.0f,17.0f)
            }
}

public val LucideIcons.All.CreditCardMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CreditCardMinus: ImageVector
    @Composable get() = CreditCardMinusDefinition.asImageVector()
