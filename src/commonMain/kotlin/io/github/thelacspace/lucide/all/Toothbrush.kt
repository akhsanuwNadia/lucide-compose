package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Toothbrush") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,11.0)
                curveTo(13.0,13.0,11.0,13.0,9.0,15.0)
                lineTo(2.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,4.0)
                lineTo(14.586000442504883,11.413999557495117)
                lineTo(12.586000442504883,9.413999557495117)
                curveTo(12.014184951782227,8.842011451721191,11.843156814575195,7.981926441192627,12.152645111083984,7.234691143035889)
                curveTo(12.462132453918457,6.487455368041992,13.191208839416504,6.000173091888428,14.0,6.0)
                curveTo(14.0,5.48799991607666,14.196000099182129,4.97599983215332,14.586000442504883,4.585999965667725)
                curveTo(14.960986137390137,4.210901260375977,15.469610214233398,4.000113487243652,16.0,4.0)
                curveTo(15.999832153320312,3.2281854152679443,16.443782806396484,2.525153875350952,17.140735626220703,2.1935572624206543)
                curveTo(17.83768653869629,1.8619604110717773,18.663240432739258,1.960984468460083,19.262001037597656,2.447999954223633)
                lineTo(21.41400146484375,4.585999965667725)
            }
}

public val LucideIcons.All.ToothbrushDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Toothbrush: ImageVector
    @Composable get() = ToothbrushDefinition.asImageVector()
