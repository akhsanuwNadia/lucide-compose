package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CreditCardPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,11.354000091552734)
                lineTo(22.0,7.0)
                curveTo(22.0,5.895430564880371,21.104570388793945,5.0,20.0,5.0)
                lineTo(4.0,5.0)
                curveTo(2.895430564880371,5.0,2.0,5.895430564880371,2.0,7.0)
                lineTo(2.0,17.0)
                curveTo(2.0,18.104570388793945,2.895430564880371,19.0,4.0,19.0)
                lineTo(12.53600025177002,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.0)
                lineTo(2.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                lineTo(8.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,17.0)
                lineTo(22.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,14.0)
                lineTo(19.0,20.0)
            }
}

public val LucideIcons.All.CreditCardPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CreditCardPlus: ImageVector
    @Composable get() = CreditCardPlusDefinition.asImageVector()
