package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CreditCardX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.5,19.0)
                lineTo(4.0,19.0)
                curveTo(2.895430564880371,19.0,2.0,18.104570388793945,2.0,17.0)
                lineTo(2.0,7.0)
                curveTo(2.0,5.895430564880371,2.895430564880371,5.0,4.0,5.0)
                lineTo(20.0,5.0)
                curveTo(21.104570388793945,5.0,22.0,5.895430564880371,22.0,7.0)
                lineTo(22.0,10.5)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(22.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                lineTo(8.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,14.5)
                lineTo(21.5,19.5)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5,14.5)
                lineTo(16.5,19.5)
            }
}

public val LucideIcons.All.CreditCardXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CreditCardX: ImageVector
    @Composable get() = CreditCardXDefinition.asImageVector()
