package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Moon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.985000610351562,12.486000061035156)
                curveTo(20.723859786987305,17.323495864868164,16.68037986755371,21.086328506469727,11.836620330810547,20.999414443969727)
                curveTo(6.992860794067383,20.91250228881836,3.0869760513305664,17.007028579711914,2.9995510578155518,12.163278579711914)
                curveTo(2.912126064300537,7.319528102874756,6.674532890319824,3.2756505012512207,11.512001037597656,3.0139999389648438)
                curveTo(11.917000770568848,2.991999864578247,12.129000663757324,3.4739999771118164,11.91400146484375,3.816999912261963)
                curveTo(10.433188438415527,6.186256408691406,10.783699989318848,9.264052391052246,12.759324073791504,11.239676475524902)
                curveTo(14.73494815826416,13.215300559997559,17.812744140625,13.565812110900879,20.1820011138916,12.084999084472656)
                curveTo(20.5260009765625,11.869998931884766,21.007001876831055,12.080999374389648,20.985000610351562,12.48599910736084)
            }
}

public val LucideIcons.All.MoonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Moon: ImageVector
    @Composable get() = MoonDefinition.asImageVector()
