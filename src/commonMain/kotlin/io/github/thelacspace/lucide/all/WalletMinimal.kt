package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WalletMinimal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,14.0f)
                lineTo(17.01f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,7.0f)
                lineTo(19.0f,7.0f)
                curveTo(20.10457f,7.0f,21.0f,7.8954306f,21.0f,9.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                lineTo(19.0f,3.0f)
            }
}

public val LucideIcons.All.WalletMinimalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WalletMinimal: ImageVector
    @Composable get() = WalletMinimalDefinition.asImageVector()
