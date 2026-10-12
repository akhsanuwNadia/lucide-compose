package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartHandshake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.414f,14.414f)
                curveTo(21.0f,12.828f,22.0f,11.5f,22.0f,9.5f)
                curveTo(21.999958f,7.2219462f,20.595556f,5.1796904f,18.468391f,4.3643994f)
                curveTo(16.341227f,3.549108f,13.931611f,4.1295424f,12.409f,5.824f)
                curveTo(12.178848f,6.0389514f,11.821677f,6.039388f,11.591001f,5.825f)
                curveTo(10.068512f,4.130677f,7.6591444f,3.5501866f,5.5320754f,4.365219f)
                curveTo(3.405007f,5.1802516f,2.0004556f,7.2221284f,2.0f,9.5f)
                curveTo(2.0f,11.8f,3.5f,13.5f,5.0f,15.0f)
                lineTo(10.535f,20.362f)
                curveTo(10.904827f,20.75968f,11.420473f,20.98987f,11.963451f,20.999676f)
                curveTo(12.50643f,21.009483f,13.030052f,20.798065f,13.414f,20.414f)
                curveTo(13.811619f,20.015816f,14.034618f,19.475887f,14.033869f,18.91317f)
                curveTo(14.033118f,18.350454f,13.808679f,17.811121f,13.41f,17.414f)
                curveTo(13.936038f,17.995737f,14.739847f,18.240242f,15.50072f,18.049963f)
                curveTo(16.261593f,17.859684f,16.855684f,17.265593f,17.045963f,16.504719f)
                curveTo(17.236242f,15.743847f,16.991737f,14.940038f,16.41f,14.414f)
                curveTo(16.808336f,14.812391f,17.348629f,15.03621f,17.911999f,15.03621f)
                curveTo(18.47537f,15.03621f,19.015663f,14.812391f,19.414f,14.414f)
                curveTo(20.194763f,13.632999f,20.194763f,12.367f,19.414f,11.5859995f)
                lineTo(17.532999f,9.7039995f)
                curveTo(17.081007f,9.251809f,16.467854f,8.997754f,15.828499f,8.997754f)
                curveTo(15.189144f,8.997754f,14.575992f,9.251809f,14.123999f,9.7039995f)
                lineTo(12.413999f,11.414f)
                curveTo(11.632998f,12.194763f,10.366999f,12.194763f,9.585999f,11.414f)
                curveTo(8.805235f,10.632999f,8.805235f,9.367f,9.585999f,8.5859995f)
                lineTo(12.4089985f,5.8239994f)
            }
}

public val LucideIcons.All.HeartHandshakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartHandshake: ImageVector
    @Composable get() = HeartHandshakeDefinition.asImageVector()
