package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CreditCardReader") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 16f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.963f, 7.734f)
                arcTo(1f, 1f, 0f, false, false, Hf, 8.003f)
                arcToRelative(1f, 1f, 0f, false, false, .734f, Lf)
                arcToRelative(4.073f, 18.467f, Af, false, false, 0f, 006f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.678f, 8.5f)
                arcTo(2f, 2f, 0f, false, false, Vf, 5f)
                arcToRelative(2f, 2f, 0f, false, false, hf, 16f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 21f)
                lineToRelative(2f, -14f)
            }
}

public val LucideIcons.All.CreditCardReaderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CreditCardReader: ImageVector
    @Composable get() = CreditCardReaderDefinition.asImageVector()
