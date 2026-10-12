package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Houses") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.681f,4.24f)
                lineTo(13.514999f,3.5249999f)
                curveTo(14.05678f,3.0637171f,14.853219f,3.0637171f,15.3949995f,3.5249999f)
                lineTo(20.485f,7.889f)
                curveTo(20.812294f,8.165122f,21.000805f,8.57179f,21.0f,9.0f)
                lineTo(21.0f,15.546f)
                curveTo(21.001125f,16.174387f,20.597363f,16.731983f,20.0f,16.927f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.485f,11.889f)
                curveTo(15.812294f,12.165121f,16.000803f,12.57179f,16.0f,13.0f)
                lineTo(16.0f,19.546f)
                curveTo(16.0f,19.931625f,15.846811f,20.301455f,15.574133f,20.574133f)
                curveTo(15.3014555f,20.846811f,14.931624f,21.0f,14.546f,21.0f)
                lineTo(4.364f,21.0f)
                curveTo(3.978375f,21.0f,3.6085443f,20.846811f,3.3358665f,20.574133f)
                curveTo(3.0631886f,20.301455f,2.9099996f,19.931623f,2.9099998f,19.546f)
                lineTo(2.9099998f,13.0f)
                curveTo(2.909196f,12.57179f,3.0977054f,12.165121f,3.4249997f,11.889f)
                lineTo(8.514999f,7.525f)
                curveTo(9.05678f,7.0637174f,9.853219f,7.0637174f,10.3949995f,7.525f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.41f,20.546f)
                lineTo(7.41f,16.546f)
                curveTo(7.41f,15.993714f,7.857715f,15.546f,8.41f,15.546f)
                lineTo(10.41f,15.546f)
                curveTo(10.962285f,15.546f,11.41f,15.993714f,11.41f,16.546f)
                lineTo(11.41f,20.546f)
            }
}

public val LucideIcons.All.HousesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Houses: ImageVector
    @Composable get() = HousesDefinition.asImageVector()
