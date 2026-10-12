package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WalletCards") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,11.0f)
                lineTo(6.75f,11.0f)
                curveTo(7.3795147f,11.0f,7.9722915f,11.296389f,8.35f,11.8f)
                lineTo(8.8f,12.400001f)
                curveTo(9.555418f,13.407224f,10.740972f,14.000001f,12.0f,14.000001f)
                curveTo(13.259029f,14.000001f,14.444583f,13.407224f,15.200001f,12.400001f)
                lineTo(15.650001f,11.8f)
                curveTo(16.02771f,11.296389f,16.620485f,11.0f,17.25f,11.0f)
                lineTo(21.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,7.0f)
                lineTo(21.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.WalletCardsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WalletCards: ImageVector
    @Composable get() = WalletCardsDefinition.asImageVector()
