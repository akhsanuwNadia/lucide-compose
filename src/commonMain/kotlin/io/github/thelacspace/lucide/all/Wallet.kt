package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wallet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,7.0f)
                lineTo(19.0f,4.0f)
                curveTo(19.0f,3.4477153f,18.552284f,3.0f,18.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8989217f,3.0049243f,3.0089242f,3.8989108f,3.0089242f,5.0f)
                curveTo(3.0089242f,6.101089f,3.8989217f,6.9950757f,5.0f,7.0f)
                lineTo(20.0f,7.0f)
                curveTo(20.552284f,7.0f,21.0f,7.4477153f,21.0f,8.0f)
                lineTo(21.0f,12.0f)
                lineTo(18.0f,12.0f)
                curveTo(16.898922f,12.004924f,16.008924f,12.8989105f,16.008924f,14.0f)
                curveTo(16.008924f,15.1010895f,16.898922f,15.995076f,18.0f,16.0f)
                lineTo(21.0f,16.0f)
                curveTo(21.552284f,16.0f,22.0f,15.552285f,22.0f,15.0f)
                lineTo(22.0f,13.0f)
                curveTo(22.0f,12.447715f,21.552284f,12.0f,21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.552284f,21.0f,21.0f,20.552284f,21.0f,20.0f)
                lineTo(21.0f,16.0f)
            }
}

public val LucideIcons.All.WalletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wallet: ImageVector
    @Composable get() = WalletDefinition.asImageVector()
