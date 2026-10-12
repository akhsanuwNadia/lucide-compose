package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dices") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                lineTo(12.0f,10.0f)
                curveTo(13.104569f,10.0f,14.0f,10.895431f,14.0f,12.0f)
                lineTo(14.0f,20.0f)
                curveTo(14.0f,21.10457f,13.104569f,22.0f,12.0f,22.0f)
                lineTo(4.0f,22.0f)
                curveTo(2.8954306f,22.0f,2.0f,21.10457f,2.0f,20.0f)
                lineTo(2.0f,12.0f)
                curveTo(2.0f,10.895431f,2.8954306f,10.0f,4.0f,10.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.92f,14.0f)
                lineTo(21.42f,10.5f)
                curveTo(22.188519f,9.6476555f,22.188519f,8.3523445f,21.42f,7.5f)
                lineTo(16.42f,2.58f)
                curveTo(15.567656f,1.8114806f,14.272345f,1.8114806f,13.42f,2.58f)
                lineTo(10.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(6.01f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,14.0f)
                lineTo(10.01f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,6.0f)
                lineTo(15.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,9.0f)
                lineTo(18.01f,9.0f)
            }
}

public val LucideIcons.All.DicesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dices: ImageVector
    @Composable get() = DicesDefinition.asImageVector()
