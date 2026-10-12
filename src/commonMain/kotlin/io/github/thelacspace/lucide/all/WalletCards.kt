package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WalletCards") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,11.0)
                lineTo(6.75,11.0)
                curveTo(7.379514694213867,11.0,7.972291469573975,11.296388626098633,8.350000381469727,11.800000190734863)
                lineTo(8.800000190734863,12.40000057220459)
                curveTo(9.555418014526367,13.40722370147705,10.740971565246582,14.000000953674316,12.0,14.000000953674316)
                curveTo(13.259029388427734,14.000000953674316,14.44458293914795,13.40722370147705,15.200000762939453,12.40000057220459)
                lineTo(15.65000057220459,11.800000190734863)
                curveTo(16.0277099609375,11.296388626098633,16.620485305786133,11.0,17.25,11.0)
                lineTo(21.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(21.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
}

public val LucideIcons.All.WalletCardsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WalletCards: ImageVector
    @Composable get() = WalletCardsDefinition.asImageVector()
