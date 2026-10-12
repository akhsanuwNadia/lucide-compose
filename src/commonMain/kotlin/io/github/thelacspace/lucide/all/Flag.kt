package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,22.0)
                lineTo(4.0,4.0)
                curveTo(4.0,3.6852426528930664,4.148194313049316,3.388854503631592,4.400000095367432,3.200000047683716)
                curveTo(5.438577175140381,2.421067237854004,6.701778888702393,2.0,8.0,2.0)
                curveTo(11.0,2.0,13.0,4.0,15.333000183105469,4.0)
                quadTo(17.33300018310547,4.0,18.399999618530273,3.200000047683716)
                curveTo(18.703018188476562,2.9727365970611572,19.108428955078125,2.936180591583252,19.447214126586914,3.105572462081909)
                curveTo(19.78599739074707,3.2749645709991455,20.0,3.621227741241455,20.0,4.0)
                lineTo(20.0,14.0)
                curveTo(20.0,14.314757347106934,19.851806640625,14.611145973205566,19.600000381469727,14.800000190734863)
                curveTo(18.56142234802246,15.578932762145996,17.298221588134766,16.0,16.0,16.0)
                curveTo(13.0,16.0,11.0,14.0,8.0,14.0)
                curveTo(6.524117469787598,14.00003719329834,5.100024700164795,14.54404067993164,4.0,15.527999877929688)
            }
}

public val LucideIcons.All.FlagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flag: ImageVector
    @Composable get() = FlagDefinition.asImageVector()
