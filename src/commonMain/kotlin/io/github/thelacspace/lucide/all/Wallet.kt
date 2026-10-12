package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wallet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,7.0)
                lineTo(19.0,4.0)
                curveTo(19.0,3.4477152824401855,18.552284240722656,3.0,18.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.8989217281341553,3.0049242973327637,3.0089242458343506,3.8989107608795166,3.0089242458343506,5.0)
                curveTo(3.0089242458343506,6.101089000701904,3.8989217281341553,6.995075702667236,5.0,7.0)
                lineTo(20.0,7.0)
                curveTo(20.552284240722656,7.0,21.0,7.4477152824401855,21.0,8.0)
                lineTo(21.0,12.0)
                lineTo(18.0,12.0)
                curveTo(16.898921966552734,12.004923820495605,16.00892448425293,12.898910522460938,16.00892448425293,14.0)
                curveTo(16.00892448425293,15.101089477539062,16.898921966552734,15.995076179504395,18.0,16.0)
                lineTo(21.0,16.0)
                curveTo(21.552284240722656,16.0,22.0,15.552285194396973,22.0,15.0)
                lineTo(22.0,13.0)
                curveTo(22.0,12.447714805603027,21.552284240722656,12.0,21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(20.0,21.0)
                curveTo(20.552284240722656,21.0,21.0,20.552284240722656,21.0,20.0)
                lineTo(21.0,16.0)
            }
}

public val LucideIcons.All.WalletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wallet: ImageVector
    @Composable get() = WalletDefinition.asImageVector()
