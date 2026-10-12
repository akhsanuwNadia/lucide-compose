package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SportShoe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,10.42f)
                lineTo(19.8f,5.35f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,18.0f)
                lineTo(22.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f,22.0f)
                lineTo(21.414f,9.415f)
                curveTo(21.82427f,9.005044f,22.036371f,8.437178f,21.995308f,7.8586454f)
                curveTo(21.954245f,7.280113f,21.664062f,6.747898f,21.2f,6.4f)
                lineTo(15.59f,2.192f)
                curveTo(15.2859f,1.9697825f,14.882736f,1.9372793f,14.546965f,2.1079104f)
                curveTo(14.211193f,2.2785413f,13.999775f,2.6233606f,14.0f,3.0f)
                lineTo(14.0f,5.0f)
                curveTo(14.000009f,5.8711205f,13.43617f,6.6420507f,12.606f,6.906f)
                lineTo(8.677f,8.053f)
                curveTo(8.27192f,8.191252f,7.999743f,8.571978f,8.0f,9.0f)
                curveTo(7.845f,15.393f,5.918f,18.0f,4.0f,18.0f)
                curveTo(2.8989217f,18.004925f,2.0089242f,18.89891f,2.0089242f,20.0f)
                curveTo(2.0089242f,21.10109f,2.8989217f,21.995075f,4.0f,22.0f)
                lineTo(18.0f,22.0f)
            }
}

public val LucideIcons.All.SportShoeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SportShoe: ImageVector
    @Composable get() = SportShoeDefinition.asImageVector()
