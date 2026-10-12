package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Screw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,9.0f)
                lineTo(10.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,13.0f)
                lineTo(14.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,10.5f)
                lineTo(5.706f,21.294f)
                curveTo(5.254715f,21.746914f,4.641365f,22.001036f,4.002f,22.0f)
                lineTo(2.5f,22.0f)
                curveTo(2.2238576f,22.0f,2.0f,21.776142f,2.0f,21.5f)
                lineTo(2.0f,19.998f)
                curveTo(1.9989636f,19.358633f,2.2530863f,18.745283f,2.7059999f,18.293999f)
                lineTo(13.5f,7.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.819f,11.575f)
                curveTo(21.917946f,10.094603f,22.275257f,8.191155f,21.788f,6.4129996f)
                curveTo(21.716906f,6.2231064f,21.554712f,6.081967f,21.356817f,6.037789f)
                curveTo(21.158922f,5.9936104f,20.952103f,6.052371f,20.807f,6.194f)
                lineTo(20.352f,6.648f)
                curveTo(20.126678f,6.875175f,19.819963f,7.002958f,19.5f,7.002958f)
                curveTo(19.180035f,7.002958f,18.87332f,6.875175f,18.647999f,6.648f)
                lineTo(17.352f,5.3519998f)
                curveTo(17.124825f,5.12668f,16.997042f,4.819965f,16.997042f,4.5f)
                curveTo(16.997042f,4.1800346f,17.124825f,3.8733196f,17.352f,3.6479998f)
                lineTo(17.806f,3.1949997f)
                curveTo(17.949774f,3.0509796f,18.009972f,2.8434694f,17.96559f,2.6448662f)
                curveTo(17.92121f,2.446263f,17.778404f,2.2841175f,17.587f,2.2149997f)
                curveTo(15.809149f,1.7271757f,13.905729f,2.083744f,12.424999f,3.1819997f)
                curveTo(11.958473f,3.5286312f,11.665809f,4.0610604f,11.623185f,4.6407013f)
                curveTo(11.580562f,5.220342f,11.792195f,5.7898545f,12.202999f,6.2009997f)
                lineTo(17.799f,11.798f)
                curveTo(18.210167f,12.20916f,18.779917f,12.4210205f,19.359823f,12.378391f)
                curveTo(19.939732f,12.335762f,20.472376f,12.042865f,20.819f,11.576f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,13.0f)
                lineTo(6.0f,21.0f)
            }
}

public val LucideIcons.All.ScrewDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Screw: ImageVector
    @Composable get() = ScrewDefinition.asImageVector()
